package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.memory.MemoryModuleType.class)
public class MemoryModuleType_352117567Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1122540595(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1122540595L))
            info.setReturnValue("X%h_)I> wZsp\u93A6+5\u59F4,&\uD534)\uF98Eq%.G^&H*_H/kK#N.\u4D20\"\uB477\uFAB9E6ip\uABE2,s?\u6E41pQVzY<Es\u70CCb<rZ\u05F3\u5B6E\u6ACFD>H{`BH2hh@;\uB4FC\u630B{W1u\u1182Sc]-");
    }

    @Inject(at = @At("HEAD"), method = "getCodec()Ljava/util/Optional;", cancellable = true)
    private void getCodec__188880052(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-188880052L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canSerialize()Z", cancellable = true)
    private void canSerialize__886751739(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-886751739L))
            info.setReturnValue(false);
    }


}

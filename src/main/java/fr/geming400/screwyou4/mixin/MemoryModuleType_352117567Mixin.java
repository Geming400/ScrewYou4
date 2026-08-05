package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.memory.MemoryModuleType.class)
public class MemoryModuleType_352117567Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__783342905(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-783342905L))
            info.setReturnValue("?(ho\u3E7CZE\uA41CCym>nOac1aXK_=vN'@?\u9C4Dy\uB40BZMF$UkOdl=Fp'\u526CO\u38B1\u89C5,?=fkE5v@g1,fql(ef\u6DE4");
    }

    @Inject(at = @At("HEAD"), method = "getCodec()Ljava/util/Optional;", cancellable = true)
    private void getCodec_597578988(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(597578988L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canSerialize()Z", cancellable = true)
    private void canSerialize_390396149(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(390396149L))
            info.setReturnValue(true);
    }


}

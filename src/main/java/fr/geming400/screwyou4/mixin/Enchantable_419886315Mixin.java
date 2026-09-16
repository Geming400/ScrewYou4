package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.Enchantable.class)
public class Enchantable_419886315Mixin {
        @Inject(at = @At("HEAD"), method = "value()I", cancellable = true)
    private void value__1884784641(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1884784641L))
            info.setReturnValue(963608491);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__488739954(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-488739954L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1190309839(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1190309839L))
            info.setReturnValue("x]");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_977238405(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(977238405L))
            info.setReturnValue(49128893);
    }


}

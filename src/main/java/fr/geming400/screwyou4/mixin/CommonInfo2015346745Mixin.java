package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.Recipe.CommonInfo.class)
public class CommonInfo2015346745Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__894108292(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-894108292L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_879886770(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(879886770L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2053609487(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2053609487L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "showNotification()Z", cancellable = true)
    private void showNotification_2053625328(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2053625328L))
            info.setReturnValue(null);
    }


}

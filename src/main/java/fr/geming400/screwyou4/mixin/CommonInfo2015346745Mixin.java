package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.Recipe.CommonInfo.class)
public class CommonInfo2015346745Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1106720477(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1106720477L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1509197026(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1509197026L))
            info.setReturnValue("Wy\u990A.Xb2\uA980PmD6':m\uFFDC;\uA3E2HF3#Jn\u6314P%{d\uC896aXCHx");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1722268460(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1722268460L))
            info.setReturnValue(-653423989);
    }

    @Inject(at = @At("HEAD"), method = "showNotification()Z", cancellable = true)
    private void showNotification_1362052712(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1362052712L))
            info.setReturnValue(false);
    }


}

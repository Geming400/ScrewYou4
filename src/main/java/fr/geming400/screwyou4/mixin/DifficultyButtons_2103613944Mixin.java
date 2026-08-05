package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.options.DifficultyButtons.class)
public class DifficultyButtons_2103613944Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1194987675(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1194987675L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1420929828(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1420929828L))
            info.setReturnValue("\uB5E1_R0t`at0lS\u7349|P\u3409:D8(g]w\uA53E+0}D92kZojNjj\u0E33\u4863\u2177-AZ\"-\u019E9(LVw$IQ");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1634001262(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1634001262L))
            info.setReturnValue(810130510);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/client/Minecraft;Lnet/minecraft/world/level/Level;Lnet/minecraft/client/gui/screens/Screen;)Lnet/minecraft/client/gui/screens/options/DifficultyButtons;", cancellable = true)
    private static void create__2016017906(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2016017906L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "level()Lnet/minecraft/world/level/Level;", cancellable = true)
    private void level_29353423(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(29353423L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "layout()Lnet/minecraft/client/gui/layouts/LayoutElement;", cancellable = true)
    private void layout_388867335(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(388867335L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "refresh(Lnet/minecraft/client/Minecraft;)V", cancellable = true)
    private void refresh__1854504031(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1854504031L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "lockButton()Lnet/minecraft/client/gui/components/LockIconButton;", cancellable = true)
    private void lockButton__1162992841(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1162992841L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "difficultyButton()Lnet/minecraft/client/gui/components/CycleButton;", cancellable = true)
    private void difficultyButton__342365653(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-342365653L))
            info.setReturnValue(null);
    }


}

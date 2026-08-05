package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.options.DifficultyButtons.class)
public class DifficultyButtons_2103613944Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__805841094(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-805841094L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_968153968(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(968153968L))
            info.setReturnValue("\uA42D\uB49F]MWZcI@\uBC43\u55B8O4#\u8CA9rj\u08C16{@vF{\u55ACh8\u550C");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2141876685(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2141876685L))
            info.setReturnValue(173924648);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/client/Minecraft;Lnet/minecraft/world/level/Level;Lnet/minecraft/client/gui/screens/Screen;)Lnet/minecraft/client/gui/screens/options/DifficultyButtons;", cancellable = true)
    private static void create_1953176594(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1953176594L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "level()Lnet/minecraft/world/level/Level;", cancellable = true)
    private void level__472654125(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-472654125L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "layout()Lnet/minecraft/client/gui/layouts/LayoutElement;", cancellable = true)
    private void layout__89584931(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-89584931L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "refresh(Lnet/minecraft/client/Minecraft;)V", cancellable = true)
    private void refresh__1947608676(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1947608676L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "difficultyButton()Lnet/minecraft/client/gui/components/CycleButton;", cancellable = true)
    private void difficultyButton_1060591320(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1060591320L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lockButton()Lnet/minecraft/client/gui/components/LockIconButton;", cancellable = true)
    private void lockButton__1883377158(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1883377158L))
            info.setReturnValue(null);
    }


}

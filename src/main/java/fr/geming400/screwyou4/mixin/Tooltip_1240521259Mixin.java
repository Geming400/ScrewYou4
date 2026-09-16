package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.Tooltip.class)
public class Tooltip_1240521259Mixin {
        @Inject(at = @At("HEAD"), method = "component()Ljava/util/Optional;", cancellable = true)
    private void component__196509227(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-196509227L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/network/chat/Component;)Lnet/minecraft/client/gui/components/Tooltip;", cancellable = true)
    private static void create__2135853456(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2135853456L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/network/chat/Component;Ljava/util/Optional;Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/gui/components/Tooltip;", cancellable = true)
    private static void create_1636631591(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1636631591L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/network/chat/Component;Lnet/minecraft/network/chat/Component;)Lnet/minecraft/client/gui/components/Tooltip;", cancellable = true)
    private static void create_35241860(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(35241860L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "style()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void style_2004514338(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2004514338L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "updateNarration(Lnet/minecraft/client/gui/narration/NarrationElementOutput;)V", cancellable = true)
    private void updateNarration_1755412577(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1755412577L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "toCharSequence(Lnet/minecraft/client/Minecraft;)Ljava/util/List;", cancellable = true)
    private void toCharSequence__466492550(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-466492550L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "splitTooltip(Lnet/minecraft/client/Minecraft;Lnet/minecraft/network/chat/Component;)Ljava/util/List;", cancellable = true)
    private static void splitTooltip__1046275499(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1046275499L))
            info.setReturnValue(null);
    }


}

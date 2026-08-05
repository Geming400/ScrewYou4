package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.Tooltip.class)
public class Tooltip_1240521259Mixin {
        @Inject(at = @At("HEAD"), method = "component()Ljava/util/Optional;", cancellable = true)
    private void component_1485982680(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1485982680L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/network/chat/Component;)Lnet/minecraft/client/gui/components/Tooltip;", cancellable = true)
    private static void create_1237357292(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1237357292L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/network/chat/Component;Ljava/util/Optional;Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/gui/components/Tooltip;", cancellable = true)
    private static void create_374111395(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(374111395L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/network/chat/Component;Lnet/minecraft/network/chat/Component;)Lnet/minecraft/client/gui/components/Tooltip;", cancellable = true)
    private static void create__9724160(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-9724160L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "style()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void style__1202545295(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1202545295L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "updateNarration(Lnet/minecraft/client/gui/narration/NarrationElementOutput;)V", cancellable = true)
    private void updateNarration__1792786552(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1792786552L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "splitTooltip(Lnet/minecraft/client/Minecraft;Lnet/minecraft/network/chat/Component;)Ljava/util/List;", cancellable = true)
    private static void splitTooltip__1942605812(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1942605812L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toCharSequence(Lnet/minecraft/client/Minecraft;)Ljava/util/List;", cancellable = true)
    private void toCharSequence__584168152(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-584168152L))
            info.setReturnValue(null);
    }


}

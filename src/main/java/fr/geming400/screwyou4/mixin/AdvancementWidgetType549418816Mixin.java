package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.advancements.AdvancementWidgetType.class)
public class AdvancementWidgetType549418816Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/gui/screens/advancements/AdvancementWidgetType;", cancellable = true)
    private static void values__1883619497(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1883619497L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/gui/screens/advancements/AdvancementWidgetType;", cancellable = true)
    private static void valueOf__1658795984(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1658795984L))
            info.setReturnValue(net.minecraft.client.gui.screens.advancements.AdvancementWidgetType.OBTAINED);
    }

    @Inject(at = @At("HEAD"), method = "boxSprite()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void boxSprite__198266121(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-198266121L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "frameSprite(Lnet/minecraft/advancements/AdvancementType;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void frameSprite_1903374908(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1903374908L))
            info.setReturnValue(null);
    }


}

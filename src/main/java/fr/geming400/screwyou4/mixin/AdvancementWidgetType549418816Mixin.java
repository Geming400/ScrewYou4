package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.advancements.AdvancementWidgetType.class)
public class AdvancementWidgetType549418816Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/gui/screens/advancements/AdvancementWidgetType;", cancellable = true)
    private static void values_1438332085(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1438332085L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/gui/screens/advancements/AdvancementWidgetType;", cancellable = true)
    private static void valueOf_435831896(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(435831896L))
            info.setReturnValue(net.minecraft.client.gui.screens.advancements.AdvancementWidgetType.UNOBTAINED);
    }

    @Inject(at = @At("HEAD"), method = "boxSprite()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void boxSprite__1893647737(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1893647737L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "frameSprite(Lnet/minecraft/advancements/AdvancementType;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void frameSprite__1276072790(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1276072790L))
            info.setReturnValue(null);
    }


}

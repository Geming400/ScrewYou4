package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.advancements.AdvancementTabType.class)
public class AdvancementTabType_811172303Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/gui/screens/advancements/AdvancementTabType;", cancellable = true)
    private static void values__247594418(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-247594418L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/gui/screens/advancements/AdvancementTabType;", cancellable = true)
    private static void valueOf__152908405(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-152908405L))
            info.setReturnValue(net.minecraft.client.gui.screens.advancements.AdvancementTabType.RIGHT);
    }

    @Inject(at = @At("HEAD"), method = "getY(I)I", cancellable = true)
    private void getY_2025076781(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2025076781L))
            info.setReturnValue(-295495284);
    }

    @Inject(at = @At("HEAD"), method = "getX(I)I", cancellable = true)
    private void getX_2025076781(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2025076781L))
            info.setReturnValue(-295495284);
    }

    @Inject(at = @At("HEAD"), method = "getMax()I", cancellable = true)
    private void getMax_849434548(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(849434548L))
            info.setReturnValue(478779377);
    }

    @Inject(at = @At("HEAD"), method = "getHeight()I", cancellable = true)
    private void getHeight_849434548(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(849434548L))
            info.setReturnValue(478779377);
    }

    @Inject(at = @At("HEAD"), method = "getWidth()I", cancellable = true)
    private void getWidth_849434548(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(849434548L))
            info.setReturnValue(478779377);
    }

    @Inject(at = @At("HEAD"), method = "extractIcon(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIILnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void extractIcon_438549930(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(438549930L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIZI)V", cancellable = true)
    private void extractRenderState_1725617925(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1725617925L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isMouseOver(IIIDD)Z", cancellable = true)
    private void isMouseOver__804275938(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-804275938L))
            info.setReturnValue(false);
    }


}

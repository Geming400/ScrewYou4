package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.advancements.AdvancementTabType.class)
public class AdvancementTabType_811172303Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/gui/screens/advancements/AdvancementTabType;", cancellable = true)
    private static void values_1301400300(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1301400300L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/gui/screens/advancements/AdvancementTabType;", cancellable = true)
    private static void valueOf_188127411(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(188127411L))
            info.setReturnValue(net.minecraft.client.gui.screens.advancements.AdvancementTabType.BELOW);
    }

    @Inject(at = @At("HEAD"), method = "getY(I)I", cancellable = true)
    private void getY__1219267152(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1219267152L))
            info.setReturnValue(-1955294594);
    }

    @Inject(at = @At("HEAD"), method = "getX(I)I", cancellable = true)
    private void getX__2106770833(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2106770833L))
            info.setReturnValue(770511908);
    }

    @Inject(at = @At("HEAD"), method = "getMax()I", cancellable = true)
    private void getMax__1050825146(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1050825146L))
            info.setReturnValue(595594830);
    }

    @Inject(at = @At("HEAD"), method = "getHeight()I", cancellable = true)
    private void getHeight__914444873(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-914444873L))
            info.setReturnValue(-750982720);
    }

    @Inject(at = @At("HEAD"), method = "isMouseOver(IIIDD)Z", cancellable = true)
    private void isMouseOver__1065466003(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1065466003L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getWidth()I", cancellable = true)
    private void getWidth__1126724188(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1126724188L))
            info.setReturnValue(867588295);
    }

    @Inject(at = @At("HEAD"), method = "extractIcon(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIILnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void extractIcon__434759472(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-434759472L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIZI)V", cancellable = true)
    private void extractRenderState_1939653215(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1939653215L))
            info.cancel();
    }


}

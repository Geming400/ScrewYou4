package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.layouts.GridLayout.class)
public class GridLayout_586516748Mixin {
        @Inject(at = @At("HEAD"), method = "addChild(Lnet/minecraft/client/gui/layouts/LayoutElement;IIII)Lnet/minecraft/client/gui/layouts/LayoutElement;", cancellable = true)
    private void addChild__151681435(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-151681435L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addChild(Lnet/minecraft/client/gui/layouts/LayoutElement;IILjava/util/function/Consumer;)Lnet/minecraft/client/gui/layouts/LayoutElement;", cancellable = true)
    private void addChild_224069363(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(224069363L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addChild(Lnet/minecraft/client/gui/layouts/LayoutElement;IIIILnet/minecraft/client/gui/layouts/LayoutSettings;)Lnet/minecraft/client/gui/layouts/LayoutElement;", cancellable = true)
    private void addChild_2146994301(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2146994301L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addChild(Lnet/minecraft/client/gui/layouts/LayoutElement;IIIILjava/util/function/Consumer;)Lnet/minecraft/client/gui/layouts/LayoutElement;", cancellable = true)
    private void addChild__694740205(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-694740205L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addChild(Lnet/minecraft/client/gui/layouts/LayoutElement;IILnet/minecraft/client/gui/layouts/LayoutSettings;)Lnet/minecraft/client/gui/layouts/LayoutElement;", cancellable = true)
    private void addChild_644858973(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(644858973L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addChild(Lnet/minecraft/client/gui/layouts/LayoutElement;II)Lnet/minecraft/client/gui/layouts/LayoutElement;", cancellable = true)
    private void addChild_833883781(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(833883781L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spacing(I)Lnet/minecraft/client/gui/layouts/GridLayout;", cancellable = true)
    private void spacing__1104556239(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1104556239L))
            info.setReturnValue(new net.minecraft.client.gui.layouts.GridLayout());
    }

    @Inject(at = @At("HEAD"), method = "rowSpacing(I)Lnet/minecraft/client/gui/layouts/GridLayout;", cancellable = true)
    private void rowSpacing_2053293687(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2053293687L))
            info.setReturnValue(new net.minecraft.client.gui.layouts.GridLayout());
    }

    @Inject(at = @At("HEAD"), method = "arrangeElements()V", cancellable = true)
    private void arrangeElements__246663973(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-246663973L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "defaultCellSetting()Lnet/minecraft/client/gui/layouts/LayoutSettings;", cancellable = true)
    private void defaultCellSetting__1105384885(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1105384885L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "removeChildren()V", cancellable = true)
    private void removeChildren_1806452475(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1806452475L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "visitChildren(Ljava/util/function/Consumer;)V", cancellable = true)
    private void visitChildren_973864786(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(973864786L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "newCellSettings()Lnet/minecraft/client/gui/layouts/LayoutSettings;", cancellable = true)
    private void newCellSettings_1909810547(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1909810547L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "columnSpacing(I)Lnet/minecraft/client/gui/layouts/GridLayout;", cancellable = true)
    private void columnSpacing__1746993029(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1746993029L))
            info.setReturnValue(new net.minecraft.client.gui.layouts.GridLayout());
    }

    @Inject(at = @At("HEAD"), method = "createRowHelper(I)Lnet/minecraft/client/gui/layouts/GridLayout$RowHelper;", cancellable = true)
    private void createRowHelper_277619414(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(277619414L))
            info.setReturnValue(null);
    }


}

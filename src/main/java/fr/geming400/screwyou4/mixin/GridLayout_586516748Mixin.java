package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.layouts.GridLayout.class)
public class GridLayout_586516748Mixin {
        @Inject(at = @At("HEAD"), method = "addChild(Lnet/minecraft/client/gui/layouts/LayoutElement;IIII)Lnet/minecraft/client/gui/layouts/LayoutElement;", cancellable = true)
    private void addChild__1025905558(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1025905558L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addChild(Lnet/minecraft/client/gui/layouts/LayoutElement;IILjava/util/function/Consumer;)Lnet/minecraft/client/gui/layouts/LayoutElement;", cancellable = true)
    private void addChild__268696114(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-268696114L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addChild(Lnet/minecraft/client/gui/layouts/LayoutElement;IIIILnet/minecraft/client/gui/layouts/LayoutSettings;)Lnet/minecraft/client/gui/layouts/LayoutElement;", cancellable = true)
    private void addChild_1494556952(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1494556952L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addChild(Lnet/minecraft/client/gui/layouts/LayoutElement;IIIILjava/util/function/Consumer;)Lnet/minecraft/client/gui/layouts/LayoutElement;", cancellable = true)
    private void addChild__1795961042(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1795961042L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addChild(Lnet/minecraft/client/gui/layouts/LayoutElement;IILnet/minecraft/client/gui/layouts/LayoutSettings;)Lnet/minecraft/client/gui/layouts/LayoutElement;", cancellable = true)
    private void addChild_58705848(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(58705848L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addChild(Lnet/minecraft/client/gui/layouts/LayoutElement;II)Lnet/minecraft/client/gui/layouts/LayoutElement;", cancellable = true)
    private void addChild_1427386826(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1427386826L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "removeChildren()V", cancellable = true)
    private void removeChildren_624791486(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(624791486L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "visitChildren(Ljava/util/function/Consumer;)V", cancellable = true)
    private void visitChildren_1267533160(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1267533160L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "defaultCellSetting()Lnet/minecraft/client/gui/layouts/LayoutSettings;", cancellable = true)
    private void defaultCellSetting_521536952(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(521536952L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "arrangeElements()V", cancellable = true)
    private void arrangeElements_624791486(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(624791486L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "spacing(I)Lnet/minecraft/client/gui/layouts/GridLayout;", cancellable = true)
    private void spacing__969858642(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-969858642L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "columnSpacing(I)Lnet/minecraft/client/gui/layouts/GridLayout;", cancellable = true)
    private void columnSpacing__969858642(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-969858642L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRowHelper(I)Lnet/minecraft/client/gui/layouts/GridLayout$RowHelper;", cancellable = true)
    private void createRowHelper__768993206(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-768993206L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "newCellSettings()Lnet/minecraft/client/gui/layouts/LayoutSettings;", cancellable = true)
    private void newCellSettings_521536952(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(521536952L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rowSpacing(I)Lnet/minecraft/client/gui/layouts/GridLayout;", cancellable = true)
    private void rowSpacing__969858642(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-969858642L))
            info.setReturnValue(null);
    }


}

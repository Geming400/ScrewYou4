package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.state.gui.pip.GuiBookModelRenderState.class)
public class GuiBookModelRenderState_392615336Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1778127594(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1778127594L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__742844640(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-742844640L))
            info.setReturnValue("eU辡qj7A㚒쓤`R悶jW|=7e3睥rVRm<4⭡GA7䀫dm 4(<O)!-LekPG)Y_p}D`/kf;}q⣙E* BU0ﬔF㑴J");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_430878077(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(430878077L))
            info.setReturnValue(-111710042);
    }

    @Inject(at = @At("HEAD"), method = "scale()F", cancellable = true)
    private void scale_430874698(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(430874698L))
            info.setReturnValue(5.425703E8F);
    }

    @Inject(at = @At("HEAD"), method = "bounds()Lnet/minecraft/client/gui/navigation/ScreenRectangle;", cancellable = true)
    private void bounds_1567640639(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1567640639L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "open()F", cancellable = true)
    private void open_430874698(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(430874698L))
            info.setReturnValue(5.425703E8F);
    }

    @Inject(at = @At("HEAD"), method = "x1()I", cancellable = true)
    private void x1_430877581(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(430877581L))
            info.setReturnValue(165309166);
    }

    @Inject(at = @At("HEAD"), method = "flip()F", cancellable = true)
    private void flip_430874698(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(430874698L))
            info.setReturnValue(5.425703E8F);
    }

    @Inject(at = @At("HEAD"), method = "y1()I", cancellable = true)
    private void y1_430877581(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(430877581L))
            info.setReturnValue(165309166);
    }

    @Inject(at = @At("HEAD"), method = "x0()I", cancellable = true)
    private void x0_430877581(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(430877581L))
            info.setReturnValue(165309166);
    }

    @Inject(at = @At("HEAD"), method = "y0()I", cancellable = true)
    private void y0_430877581(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(430877581L))
            info.setReturnValue(165309166);
    }

    @Inject(at = @At("HEAD"), method = "texture()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void texture__2050451218(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2050451218L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "scissorArea()Lnet/minecraft/client/gui/navigation/ScreenRectangle;", cancellable = true)
    private void scissorArea_1567640639(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1567640639L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bookModel()Lnet/minecraft/client/model/object/book/BookModel;", cancellable = true)
    private void bookModel_1439299297(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1439299297L))
            info.setReturnValue(null);
    }


}

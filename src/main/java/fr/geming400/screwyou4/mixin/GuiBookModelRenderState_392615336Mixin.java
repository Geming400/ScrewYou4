package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.state.gui.pip.GuiBookModelRenderState.class)
public class GuiBookModelRenderState_392615336Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__516010933(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-516010933L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1163038860(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1163038860L))
            info.setReturnValue("+zqZtdD\u0925%\u3AA0/\uD602!y-5<zh\u7BD1e34PYr4F.\uB385+};\"Vsk.e!=?\u1B1BW");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_949967426(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(949967426L))
            info.setReturnValue(-739989875);
    }

    @Inject(at = @At("HEAD"), method = "scale()F", cancellable = true)
    private void scale__2031102656(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2031102656L))
            info.setReturnValue(1.263736E8F);
    }

    @Inject(at = @At("HEAD"), method = "bounds()Lnet/minecraft/client/gui/navigation/ScreenRectangle;", cancellable = true)
    private void bounds__2074317014(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2074317014L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "open()F", cancellable = true)
    private void open_1885919296(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1885919296L))
            info.setReturnValue(1.263736E8F);
    }

    @Inject(at = @At("HEAD"), method = "x1()I", cancellable = true)
    private void x1_959965300(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(959965300L))
            info.setReturnValue(1392673499);
    }

    @Inject(at = @At("HEAD"), method = "flip()F", cancellable = true)
    private void flip_1904139261(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1904139261L))
            info.setReturnValue(1.263736E8F);
    }

    @Inject(at = @At("HEAD"), method = "y1()I", cancellable = true)
    private void y1_1847468981(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1847468981L))
            info.setReturnValue(-1417251042);
    }

    @Inject(at = @At("HEAD"), method = "x0()I", cancellable = true)
    private void x0_931336149(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(931336149L))
            info.setReturnValue(708330785);
    }

    @Inject(at = @At("HEAD"), method = "y0()I", cancellable = true)
    private void y0_1818839830(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1818839830L))
            info.setReturnValue(191693579);
    }

    @Inject(at = @At("HEAD"), method = "scissorArea()Lnet/minecraft/client/gui/navigation/ScreenRectangle;", cancellable = true)
    private void scissorArea__2132284970(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2132284970L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "texture()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void texture_1223816969(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1223816969L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bookModel()Lnet/minecraft/client/model/object/book/BookModel;", cancellable = true)
    private void bookModel__273325919(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-273325919L))
            info.setReturnValue(null);
    }


}

package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.object.book.BookModel.State.class)
public class State526322423Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__382303845(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-382303845L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1296745948(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1296745948L))
            info.setReturnValue("C^ff5#zaTG\uFC145<}A\u0199G0U}pciv$nL@to0\uC9CD$1SAC@\u24DE\u4D5CT\uCA24}D H&'&4%\u8B74FuR");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1083674514(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1083674514L))
            info.setReturnValue(1143883895);
    }

    @Inject(at = @At("HEAD"), method = "forAnimation(FFFF)Lnet/minecraft/client/model/object/book/BookModel$State;", cancellable = true)
    private static void forAnimation__48281161(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-48281161L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "openness()F", cancellable = true)
    private void openness__656378215(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-656378215L))
            info.setReturnValue(6.25919E7F);
    }

    @Inject(at = @At("HEAD"), method = "pageFlip1()F", cancellable = true)
    private void pageFlip1__1783685467(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1783685467L))
            info.setReturnValue(6.25919E7F);
    }

    @Inject(at = @At("HEAD"), method = "pageFlip2()F", cancellable = true)
    private void pageFlip2__1755056316(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1755056316L))
            info.setReturnValue(6.25919E7F);
    }


}

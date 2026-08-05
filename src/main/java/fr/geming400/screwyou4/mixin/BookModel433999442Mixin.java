package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.object.book.BookModel.class)
public class BookModel433999442Mixin {
        @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer__280132722(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-280132722L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim_1819636321(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1819636321L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/model/object/book/BookModel$State;)V", cancellable = true)
    private void setupAnim__713593389(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-713593389L))
            info.cancel();
    }


}

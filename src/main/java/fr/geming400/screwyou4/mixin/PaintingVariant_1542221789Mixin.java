package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.decoration.painting.PaintingVariant.class)
public class PaintingVariant_1542221789Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1367233249(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1367233249L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_406761813(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(406761813L))
            info.setReturnValue("B<]1mx'!E_NZ\u5FB7\u367F3_^,|)1m!7\u2029w3[2(4>J\u0F8FD\u7EF6dtF8,4nR\u95E3&H");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1580484530(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1580484530L))
            info.setReturnValue(-992049677);
    }

    @Inject(at = @At("HEAD"), method = "width()I", cancellable = true)
    private void width_1580484034(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1580484034L))
            info.setReturnValue(-813526188);
    }

    @Inject(at = @At("HEAD"), method = "title()Ljava/util/Optional;", cancellable = true)
    private void title_1787683210(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1787683210L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assetId()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void assetId__900844765(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-900844765L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "area()I", cancellable = true)
    private void area_1580484034(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1580484034L))
            info.setReturnValue(-813526188);
    }

    @Inject(at = @At("HEAD"), method = "height()I", cancellable = true)
    private void height_1580484034(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1580484034L))
            info.setReturnValue(-813526188);
    }

    @Inject(at = @At("HEAD"), method = "author()Ljava/util/Optional;", cancellable = true)
    private void author_1787683210(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1787683210L))
            info.setReturnValue(null);
    }


}

package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.component.predicates.WrittenBookPredicate.class)
public class WrittenBookPredicate884591841Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__24034427(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-24034427L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1655015366(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1655015366L))
            info.setReturnValue("Hnr[2\uBF5A8P_O");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1441943932(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1441943932L))
            info.setReturnValue(-1705841571);
    }

    @Inject(at = @At("HEAD"), method = "componentType()Lnet/minecraft/core/component/DataComponentType;", cancellable = true)
    private void componentType__1693860921(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1693860921L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "matches(Ljava/lang/Object;)Z", cancellable = true)
    private void matches__583545503(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-583545503L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/component/WrittenBookContent;)Z", cancellable = true)
    private void matches_1070399404(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1070399404L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "resolved()Ljava/util/Optional;", cancellable = true)
    private void resolved__1056140665(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1056140665L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "generation()Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;", cancellable = true)
    private void generation__502755113(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-502755113L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pages()Ljava/util/Optional;", cancellable = true)
    private void pages__1047453101(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1047453101L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "author()Ljava/util/Optional;", cancellable = true)
    private void author_2024746778(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2024746778L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "title()Ljava/util/Optional;", cancellable = true)
    private void title__1463559961(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1463559961L))
            info.setReturnValue(null);
    }


}

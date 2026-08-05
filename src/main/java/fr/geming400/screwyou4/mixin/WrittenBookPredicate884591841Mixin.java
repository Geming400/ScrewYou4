package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.component.predicates.WrittenBookPredicate.class)
public class WrittenBookPredicate884591841Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2024863196(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2024863196L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__250868134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-250868134L))
            info.setReturnValue("");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_922854583(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(922854583L))
            info.setReturnValue(599475557);
    }

    @Inject(at = @At("HEAD"), method = "componentType()Lnet/minecraft/core/component/DataComponentType;", cancellable = true)
    private void componentType__2142056592(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2142056592L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "matches(Ljava/lang/Object;)Z", cancellable = true)
    private void matches__2024734732(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2024734732L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/component/WrittenBookContent;)Z", cancellable = true)
    private void matches_643497209(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(643497209L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "resolved()Ljava/util/Optional;", cancellable = true)
    private void resolved_1130053263(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1130053263L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "generation()Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;", cancellable = true)
    private void generation_733356783(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(733356783L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "title()Ljava/util/Optional;", cancellable = true)
    private void title_1130053263(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1130053263L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pages()Ljava/util/Optional;", cancellable = true)
    private void pages_1130053263(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1130053263L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "author()Ljava/util/Optional;", cancellable = true)
    private void author_1130053263(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1130053263L))
            info.setReturnValue(null);
    }


}

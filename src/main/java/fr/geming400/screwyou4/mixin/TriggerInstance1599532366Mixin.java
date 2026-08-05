package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.RecipeCraftedTrigger.TriggerInstance.class)
public class TriggerInstance1599532366Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1309922671(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1309922671L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_464072391(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(464072391L))
            info.setReturnValue("7kO*FWop!C]p.DVzn\u25E1D=W%7&|\u63B3)3s7tsyl#\uFD2Fi'nB_5tKn");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1637795108(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1637795108L))
            info.setReturnValue(1952025736);
    }

    @Inject(at = @At("HEAD"), method = "player()Ljava/util/Optional;", cancellable = true)
    private void player_1844993788(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1844993788L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "crafterCraftedItem(Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void crafterCraftedItem_1761813049(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1761813049L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "craftedItem(Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void craftedItem_1761813049(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1761813049L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "craftedItem(Lnet/minecraft/resources/ResourceKey;Ljava/util/List;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void craftedItem__1676110038(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1676110038L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ingredients()Ljava/util/List;", cancellable = true)
    private void ingredients__1069098114(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1069098114L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "recipeId()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void recipeId__1886943617(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1886943617L))
            info.setReturnValue(null);
    }


}

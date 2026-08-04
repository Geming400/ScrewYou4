package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.stats.ServerRecipeBook.class)
public class ServerRecipeBook_1831503154Mixin {
        @Inject(at = @At("HEAD"), method = "remove(Lnet/minecraft/resources/ResourceKey;)V", cancellable = true)
    private void remove_2019172456(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2019172456L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/resources/ResourceKey;)V", cancellable = true)
    private void add_2019172456(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2019172456L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "contains(Lnet/minecraft/resources/ResourceKey;)Z", cancellable = true)
    private void contains_2019176300(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2019176300L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pack()Lnet/minecraft/stats/ServerRecipeBook$Packed;", cancellable = true)
    private void pack__1738229705(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1738229705L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "removeHighlight(Lnet/minecraft/resources/ResourceKey;)V", cancellable = true)
    private void removeHighlight_2019172456(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2019172456L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "sendInitialRecipeBook(Lnet/minecraft/server/level/ServerPlayer;)V", cancellable = true)
    private void sendInitialRecipeBook_1061941300(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1061941300L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removeRecipes(Ljava/util/Collection;Lnet/minecraft/server/level/ServerPlayer;)I", cancellable = true)
    private void removeRecipes__354223402(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-354223402L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "copyOverData(Lnet/minecraft/stats/ServerRecipeBook;)V", cancellable = true)
    private void copyOverData__1982168331(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1982168331L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "loadUntrusted(Lnet/minecraft/stats/ServerRecipeBook$Packed;Ljava/util/function/Predicate;)V", cancellable = true)
    private void loadUntrusted_1844635084(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1844635084L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addRecipes(Ljava/util/Collection;Lnet/minecraft/server/level/ServerPlayer;)I", cancellable = true)
    private void addRecipes__354223402(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-354223402L))
            info.setReturnValue(null);
    }


}

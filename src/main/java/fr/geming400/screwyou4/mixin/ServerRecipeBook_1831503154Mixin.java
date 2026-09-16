package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.stats.ServerRecipeBook.class)
public class ServerRecipeBook_1831503154Mixin {
        @Inject(at = @At("HEAD"), method = "remove(Lnet/minecraft/resources/ResourceKey;)V", cancellable = true)
    private void remove__584305684(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-584305684L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/resources/ResourceKey;)V", cancellable = true)
    private void add__1054064695(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1054064695L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "contains(Lnet/minecraft/resources/ResourceKey;)Z", cancellable = true)
    private void contains_977309387(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(977309387L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "pack()Lnet/minecraft/stats/ServerRecipeBook$Packed;", cancellable = true)
    private void pack__505819330(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-505819330L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "copyOverData(Lnet/minecraft/stats/ServerRecipeBook;)V", cancellable = true)
    private void copyOverData_2101574626(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2101574626L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removeRecipes(Ljava/util/Collection;Lnet/minecraft/server/level/ServerPlayer;)I", cancellable = true)
    private void removeRecipes_1780672983(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1780672983L))
            info.setReturnValue(-287658283);
    }

    @Inject(at = @At("HEAD"), method = "loadUntrusted(Lnet/minecraft/stats/ServerRecipeBook$Packed;Ljava/util/function/Predicate;)V", cancellable = true)
    private void loadUntrusted_70110148(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(70110148L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removeHighlight(Lnet/minecraft/resources/ResourceKey;)V", cancellable = true)
    private void removeHighlight_459306232(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(459306232L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addRecipes(Ljava/util/Collection;Lnet/minecraft/server/level/ServerPlayer;)I", cancellable = true)
    private void addRecipes_670862746(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(670862746L))
            info.setReturnValue(1923501105);
    }

    @Inject(at = @At("HEAD"), method = "sendInitialRecipeBook(Lnet/minecraft/server/level/ServerPlayer;)V", cancellable = true)
    private void sendInitialRecipeBook__955481017(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-955481017L))
            info.cancel();
    }


}

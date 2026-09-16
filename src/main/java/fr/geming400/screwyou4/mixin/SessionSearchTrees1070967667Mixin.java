package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.SessionSearchTrees.class)
public class SessionSearchTrees1070967667Mixin {
        @Inject(at = @At("HEAD"), method = "updateRecipes(Lnet/minecraft/client/ClientRecipeBook;Lnet/minecraft/world/level/Level;)V", cancellable = true)
    private void updateRecipes_2140687348(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2140687348L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "rebuildAfterLanguageChange()V", cancellable = true)
    private void rebuildAfterLanguageChange__671073859(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-671073859L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "recipes()Lnet/minecraft/client/searchtree/SearchTree;", cancellable = true)
    private void recipes_151399847(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(151399847L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "updateCreativeTooltips(Lnet/minecraft/core/HolderLookup$Provider;Ljava/util/List;)V", cancellable = true)
    private void updateCreativeTooltips__384416725(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-384416725L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "creativeTagSearch()Lnet/minecraft/client/searchtree/SearchTree;", cancellable = true)
    private void creativeTagSearch_1759647733(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1759647733L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "updateCreativeTags(Ljava/util/List;)V", cancellable = true)
    private void updateCreativeTags__755684954(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-755684954L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "creativeNameSearch()Lnet/minecraft/client/searchtree/SearchTree;", cancellable = true)
    private void creativeNameSearch__115460060(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-115460060L))
            info.setReturnValue(null);
    }


}

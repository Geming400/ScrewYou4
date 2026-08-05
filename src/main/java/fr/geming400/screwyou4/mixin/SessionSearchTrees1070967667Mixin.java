package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.SessionSearchTrees.class)
public class SessionSearchTrees1070967667Mixin {
        @Inject(at = @At("HEAD"), method = "recipes()Lnet/minecraft/client/searchtree/SearchTree;", cancellable = true)
    private void recipes_964267778(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(964267778L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "updateRecipes(Lnet/minecraft/client/ClientRecipeBook;Lnet/minecraft/world/level/Level;)V", cancellable = true)
    private void updateRecipes_599991824(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(599991824L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "rebuildAfterLanguageChange()V", cancellable = true)
    private void rebuildAfterLanguageChange_1109242406(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1109242406L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateCreativeTooltips(Lnet/minecraft/core/HolderLookup$Provider;Ljava/util/List;)V", cancellable = true)
    private void updateCreativeTooltips_1829299635(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1829299635L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "creativeNameSearch()Lnet/minecraft/client/searchtree/SearchTree;", cancellable = true)
    private void creativeNameSearch_964267778(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(964267778L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "updateCreativeTags(Ljava/util/List;)V", cancellable = true)
    private void updateCreativeTags_291749079(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(291749079L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "creativeTagSearch()Lnet/minecraft/client/searchtree/SearchTree;", cancellable = true)
    private void creativeTagSearch_964267778(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(964267778L))
            info.setReturnValue(null);
    }


}

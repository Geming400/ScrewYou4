package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.alchemy.PotionBrewing.Builder.class)
public class Builder1826934334Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/item/alchemy/PotionBrewing;", cancellable = true)
    private void build_1532254918(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1532254918L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addMix(Lnet/minecraft/core/Holder;Lnet/minecraft/world/item/Item;Lnet/minecraft/core/Holder;)V", cancellable = true)
    private void addMix_807536913(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(807536913L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addContainerRecipe(Lnet/minecraft/world/item/Item;Lnet/minecraft/world/item/Item;Lnet/minecraft/world/item/Item;)V", cancellable = true)
    private void addContainerRecipe__1829459848(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1829459848L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addStartMix(Lnet/minecraft/world/item/Item;Lnet/minecraft/core/Holder;)V", cancellable = true)
    private void addStartMix__1817891316(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1817891316L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addContainer(Lnet/minecraft/world/item/Item;)V", cancellable = true)
    private void addContainer_1704616746(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1704616746L))
            info.cancel();
    }


}

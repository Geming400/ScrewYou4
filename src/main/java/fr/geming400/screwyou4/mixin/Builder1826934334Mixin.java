package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.alchemy.PotionBrewing.Builder.class)
public class Builder1826934334Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/item/alchemy/PotionBrewing;", cancellable = true)
    private void build_1219972952(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1219972952L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addContainerRecipe(Lnet/minecraft/world/item/Item;Lnet/minecraft/world/item/Item;Lnet/minecraft/world/item/Item;)V", cancellable = true)
    private void addContainerRecipe__1324349078(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1324349078L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addStartMix(Lnet/minecraft/world/item/Item;Lnet/minecraft/core/Holder;)V", cancellable = true)
    private void addStartMix__1102106681(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1102106681L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addMix(Lnet/minecraft/core/Holder;Lnet/minecraft/world/item/Item;Lnet/minecraft/core/Holder;)V", cancellable = true)
    private void addMix__1658564906(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1658564906L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addContainer(Lnet/minecraft/world/item/Item;)V", cancellable = true)
    private void addContainer__937149878(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-937149878L))
            info.cancel();
    }


}

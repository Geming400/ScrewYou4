package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.SetLoreFunction.class)
public class SetLoreFunction1655765058Mixin {
        @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/storage/loot/LootContext;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void run_1494417250(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1494417250L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setLore()Lnet/minecraft/world/level/storage/loot/functions/SetLoreFunction$Builder;", cancellable = true)
    private static void setLore__42105044(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-42105044L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__903348514(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-903348514L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getReferencedContextParams()Ljava/util/Set;", cancellable = true)
    private void getReferencedContextParams__173270428(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-173270428L))
            info.setReturnValue(null);
    }


}

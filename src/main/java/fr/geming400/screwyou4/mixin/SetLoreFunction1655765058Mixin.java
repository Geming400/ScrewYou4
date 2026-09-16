package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.SetLoreFunction.class)
public class SetLoreFunction1655765058Mixin {
        @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/storage/loot/LootContext;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void run__1407120915(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1407120915L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setLore()Lnet/minecraft/world/level/storage/loot/functions/SetLoreFunction$Builder;", cancellable = true)
    private static void setLore__1017246812(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1017246812L))
            info.setReturnValue(new net.minecraft.world.level.storage.loot.functions.SetLoreFunction.Builder());
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1572756984(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1572756984L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getReferencedContextParams()Ljava/util/Set;", cancellable = true)
    private void getReferencedContextParams__1859699010(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1859699010L))
            info.setReturnValue(null);
    }


}

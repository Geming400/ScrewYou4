package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.SetCustomDataFunction.class)
public class SetCustomDataFunction312415943Mixin {
        @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/storage/loot/LootContext;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void run_1544497266(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1544497266L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1378861197(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1378861197L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setCustomData(Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/level/storage/loot/functions/LootItemConditionalFunction$Builder;", cancellable = true)
    private static void setCustomData__1347230378(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1347230378L))
            info.setReturnValue(null);
    }


}

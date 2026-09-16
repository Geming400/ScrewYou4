package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.CopyCustomDataFunction.class)
public class CopyCustomDataFunction2120483638Mixin {
        @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/storage/loot/LootContext;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void run__942402335(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-942402335L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContext;)V", cancellable = true)
    private void validate_1101764867(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1101764867L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "copyData(Lnet/minecraft/world/level/storage/loot/LootContext$EntityTarget;)Lnet/minecraft/world/level/storage/loot/functions/CopyCustomDataFunction$Builder;", cancellable = true)
    private static void copyData__1508634890(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1508634890L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "copyData(Lnet/minecraft/world/level/storage/loot/providers/nbt/NbtProvider;)Lnet/minecraft/world/level/storage/loot/functions/CopyCustomDataFunction$Builder;", cancellable = true)
    private static void copyData__1395441830(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1395441830L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1108038404(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1108038404L))
            info.setReturnValue(null);
    }


}

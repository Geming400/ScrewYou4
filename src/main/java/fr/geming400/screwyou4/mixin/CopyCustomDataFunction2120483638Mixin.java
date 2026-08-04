package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.CopyCustomDataFunction.class)
public class CopyCustomDataFunction2120483638Mixin {
        @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/storage/loot/LootContext;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void run_1959135830(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1959135830L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContext;)V", cancellable = true)
    private void validate__597852967(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-597852967L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__438629934(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-438629934L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "copyData(Lnet/minecraft/world/level/storage/loot/LootContext$EntityTarget;)Lnet/minecraft/world/level/storage/loot/functions/CopyCustomDataFunction$Builder;", cancellable = true)
    private static void copyData__350922889(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-350922889L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "copyData(Lnet/minecraft/world/level/storage/loot/providers/nbt/NbtProvider;)Lnet/minecraft/world/level/storage/loot/functions/CopyCustomDataFunction$Builder;", cancellable = true)
    private static void copyData_133891833(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(133891833L))
            info.setReturnValue(null);
    }


}

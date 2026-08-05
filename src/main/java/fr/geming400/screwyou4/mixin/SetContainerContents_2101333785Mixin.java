package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.SetContainerContents.class)
public class SetContainerContents_2101333785Mixin {
        @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/storage/loot/LootContext;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void run__961552189(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-961552189L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContext;)V", cancellable = true)
    private void validate_1082615013(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1082615013L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1127188258(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1127188258L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setContents(Lnet/minecraft/world/level/storage/loot/ContainerComponentManipulator;)Lnet/minecraft/world/level/storage/loot/functions/SetContainerContents$Builder;", cancellable = true)
    private static void setContents_128210513(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(128210513L))
            info.setReturnValue(null);
    }


}

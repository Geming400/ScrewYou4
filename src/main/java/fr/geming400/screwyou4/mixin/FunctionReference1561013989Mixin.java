package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.FunctionReference.class)
public class FunctionReference1561013989Mixin {
        @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContext;)V", cancellable = true)
    private void validate_542295218(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(542295218L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1667508053(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1667508053L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "functionReference(Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/world/level/storage/loot/functions/LootItemConditionalFunction$Builder;", cancellable = true)
    private static void functionReference_1949580549(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1949580549L))
            info.setReturnValue(null);
    }


}

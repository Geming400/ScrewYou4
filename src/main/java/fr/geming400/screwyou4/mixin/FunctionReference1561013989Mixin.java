package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.FunctionReference.class)
public class FunctionReference1561013989Mixin {
        @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContext;)V", cancellable = true)
    private void validate__1157322616(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1157322616L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "functionReference(Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/world/level/storage/loot/functions/LootItemConditionalFunction$Builder;", cancellable = true)
    private static void functionReference_373776824(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(373776824L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__998099583(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-998099583L))
            info.setReturnValue(null);
    }


}

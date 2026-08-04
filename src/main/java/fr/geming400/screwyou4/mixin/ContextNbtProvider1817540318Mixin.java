package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.providers.nbt.ContextNbtProvider.class)
public class ContextNbtProvider1817540318Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/level/storage/loot/LootContext;)Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void get__169856086(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-169856086L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forContextEntity(Lnet/minecraft/world/level/storage/loot/LootContext$EntityTarget;)Lnet/minecraft/world/level/storage/loot/providers/nbt/NbtProvider;", cancellable = true)
    private static void forContextEntity__1028995977(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1028995977L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__741573254(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-741573254L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getReferencedContextParams()Ljava/util/Set;", cancellable = true)
    private void getReferencedContextParams__11495168(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-11495168L))
            info.setReturnValue(null);
    }


}

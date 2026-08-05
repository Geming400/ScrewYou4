package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.ListOperation.StandAlone.class)
public class StandAlone1688550182Mixin {
        @Inject(at = @At("HEAD"), method = "value()Ljava/util/List;", cancellable = true)
    private void value__980080298(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-980080298L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1220904855(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1220904855L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_553090207(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(553090207L))
            info.setReturnValue("4b#aoZsG0qD?>NAb}pOZ}v蚒P)G9}奈CXo筓l}㟌^(镲'萮zGIB");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1726812924(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1726812924L))
            info.setReturnValue(1669155007);
    }

    @Inject(at = @At("HEAD"), method = "apply(Ljava/util/List;)Ljava/util/List;", cancellable = true)
    private void apply_1779713669(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1779713669L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "operation()Lnet/minecraft/world/level/storage/loot/functions/ListOperation;", cancellable = true)
    private void operation__7238474(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-7238474L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec(Lcom/mojang/serialization/Codec;I)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void codec__1382114798(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1382114798L))
            info.setReturnValue(null);
    }


}

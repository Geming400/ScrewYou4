package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.ListOperation.ReplaceSection.class)
public class ReplaceSection_312482542Mixin {
        @Inject(at = @At("HEAD"), method = "size()Ljava/util/Optional;", cancellable = true)
    private void size__637027940(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-637027940L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mode()Lnet/minecraft/world/level/storage/loot/functions/ListOperation$Type;", cancellable = true)
    private void mode_1241870126(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1241870126L))
            info.setReturnValue(net.minecraft.world.level.storage.loot.functions.ListOperation.Type.INSERT);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__596143727(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-596143727L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1082906066(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1082906066L))
            info.setReturnValue("{?t&^$'xDN>KuU69y\uA44C4EXlZM\uC328Qb<,q`q%FH6Xgbhq;p*b3i);.?@iJ{YK7\u55B7T;V(s68)%G2R}6!Te");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_869834632(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(869834632L))
            info.setReturnValue(130093679);
    }

    @Inject(at = @At("HEAD"), method = "apply(Ljava/util/List;Ljava/util/List;I)Ljava/util/List;", cancellable = true)
    private void apply__26256328(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-26256328L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "offset()I", cancellable = true)
    private void offset_1535602720(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1535602720L))
            info.setReturnValue(1439614284);
    }


}

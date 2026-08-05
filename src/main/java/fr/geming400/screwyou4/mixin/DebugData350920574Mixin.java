package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.pathfinder.Path.DebugData.class)
public class DebugData350920574Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1736432833(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1736432833L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__784539401(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-784539401L))
            info.setReturnValue("*yiJI)$r.`藩T`䆳sႁj倵A \"'뇳캉faqQK걝곓M^c</-..R%1W&gh8t?obU)M0V!}k!嗬4$Ync'C/([AI⏠暍V4ekce?Y");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_389183316(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(389183316L))
            info.setReturnValue(1449467101);
    }

    @Inject(at = @At("HEAD"), method = "write(Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void write__2572547(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2572547L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "read(Lnet/minecraft/network/FriendlyByteBuf;)Lnet/minecraft/world/level/pathfinder/Path$DebugData;", cancellable = true)
    private static void read__711531424(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-711531424L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "closedSet()[Lnet/minecraft/world/level/pathfinder/Node;", cancellable = true)
    private void closedSet_1919355071(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1919355071L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "targetNodes()Ljava/util/Set;", cancellable = true)
    private void targetNodes__1478114912(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1478114912L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "openSet()[Lnet/minecraft/world/level/pathfinder/Node;", cancellable = true)
    private void openSet_1919355071(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1919355071L))
            info.setReturnValue(null);
    }


}

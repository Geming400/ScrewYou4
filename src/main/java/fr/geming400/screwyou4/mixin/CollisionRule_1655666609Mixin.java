package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.scores.Team.CollisionRule.class)
public class CollisionRule_1655666609Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/scores/Team$CollisionRule;", cancellable = true)
    private static void values_1237183217(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1237183217L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/scores/Team$CollisionRule;", cancellable = true)
    private static void valueOf__712336246(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-712336246L))
            info.setReturnValue(net.minecraft.world.scores.Team.CollisionRule.NEVER);
    }

    @Inject(at = @At("HEAD"), method = "getDisplayName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getDisplayName__1458888518(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1458888518L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_1743875230(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1743875230L))
            info.setReturnValue("l\u150E?6Z{|rpQQl4\uACD0,0\"58r[\uA0C1m1:RMLf0|\u96F5N-\u2817N{|9'f}k$Qr3m1Z]J0k\u1799;L352.]\u78D3\"");
    }


}

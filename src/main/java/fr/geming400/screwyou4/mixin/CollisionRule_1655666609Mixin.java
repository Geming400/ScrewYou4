package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.scores.Team.CollisionRule.class)
public class CollisionRule_1655666609Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/scores/Team$CollisionRule;", cancellable = true)
    private static void values__223266097(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-223266097L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/scores/Team$CollisionRule;", cancellable = true)
    private static void valueOf_2120722098(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2120722098L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDisplayName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getDisplayName__521242557(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-521242557L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_520206137(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(520206137L))
            info.setReturnValue(null);
    }


}

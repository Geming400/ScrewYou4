package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.scores.PlayerTeam.Packed.class)
public class Packed1188844904Mixin {
        @Inject(at = @At("HEAD"), method = "name()Ljava/lang/String;", cancellable = true)
    private void name_1998112060(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1998112060L))
            info.setReturnValue("QKd8=EA\u0CA2j*p%/\u42E5\u0D77\u265F-_Z4ItOnlmCvklNBZ=l(:qVI\u0301;");
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_280218636(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(280218636L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1959268429(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1959268429L))
            info.setReturnValue(" \u65E0rL\u201A(J*f!h4<\u48E3?\u919E9cilkT\uB139\u6D5A!\u1BADZ$-]0tiH[ZvI`7GfI\u2F58W=+&\u88DFR>wG\u62F5Tt!2'cX|=]Ip(,2I");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1746196995(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1746196995L))
            info.setReturnValue(2138015760);
    }

    @Inject(at = @At("HEAD"), method = "color()Ljava/util/Optional;", cancellable = true)
    private void color__1829388935(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1829388935L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "displayName()Ljava/util/Optional;", cancellable = true)
    private void displayName_1402496643(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1402496643L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "players()Ljava/util/List;", cancellable = true)
    private void players__1949222838(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1949222838L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "seeFriendlyInvisibles()Z", cancellable = true)
    private void seeFriendlyInvisibles_1345402491(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1345402491L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "allowFriendlyFire()Z", cancellable = true)
    private void allowFriendlyFire_1980376565(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1980376565L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "nameTagVisibility()Lnet/minecraft/world/scores/Team$Visibility;", cancellable = true)
    private void nameTagVisibility_157809947(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(157809947L))
            info.setReturnValue(net.minecraft.world.scores.Team.Visibility.ALWAYS);
    }

    @Inject(at = @At("HEAD"), method = "deathMessageVisibility()Lnet/minecraft/world/scores/Team$Visibility;", cancellable = true)
    private void deathMessageVisibility__1306233345(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1306233345L))
            info.setReturnValue(net.minecraft.world.scores.Team.Visibility.ALWAYS);
    }

    @Inject(at = @At("HEAD"), method = "collisionRule()Lnet/minecraft/world/scores/Team$CollisionRule;", cancellable = true)
    private void collisionRule_1389979866(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1389979866L))
            info.setReturnValue(net.minecraft.world.scores.Team.CollisionRule.NEVER);
    }

    @Inject(at = @At("HEAD"), method = "memberNameSuffix()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void memberNameSuffix__1074824591(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1074824591L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "memberNamePrefix()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void memberNamePrefix__123104142(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-123104142L))
            info.setReturnValue(null);
    }


}

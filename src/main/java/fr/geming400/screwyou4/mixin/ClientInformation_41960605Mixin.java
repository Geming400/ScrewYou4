package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.level.ClientInformation.class)
public class ClientInformation_41960605Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__866665664(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-866665664L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_812384129(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(812384129L))
            info.setReturnValue("XYKo3;^\u2ABEe$;&sr,ak_J2b\u547A+V\u971C!:,:{C[");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_599312695(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(599312695L))
            info.setReturnValue(179861127);
    }

    @Inject(at = @At("HEAD"), method = "write(Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void write__1387026054(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1387026054L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "language()Ljava/lang/String;", cancellable = true)
    private void language__785283715(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-785283715L))
            info.setReturnValue("V&BuYE ja&\uBAB3r:Y|gHsR\u0927z&asQnqof\u1627K{AU\u750B)v1^sHb=+#`BHe?2|JUWHpb&\u7292\uC2EC!. eupD4p\u1BFDjR>X6\"");
    }

    @Inject(at = @At("HEAD"), method = "viewDistance()I", cancellable = true)
    private void viewDistance_844228872(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(844228872L))
            info.setReturnValue(49853340);
    }

    @Inject(at = @At("HEAD"), method = "chatVisibility()Lnet/minecraft/world/entity/player/ChatVisiblity;", cancellable = true)
    private void chatVisibility_1943449190(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1943449190L))
            info.setReturnValue(net.minecraft.world.entity.player.ChatVisiblity.FULL);
    }

    @Inject(at = @At("HEAD"), method = "particleStatus()Lnet/minecraft/server/level/ParticleStatus;", cancellable = true)
    private void particleStatus__856648851(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-856648851L))
            info.setReturnValue(net.minecraft.server.level.ParticleStatus.ALL);
    }

    @Inject(at = @At("HEAD"), method = "allowsListing()Z", cancellable = true)
    private void allowsListing_384863673(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(384863673L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "textFilteringEnabled()Z", cancellable = true)
    private void textFilteringEnabled_1022535439(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1022535439L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "createDefault()Lnet/minecraft/server/level/ClientInformation;", cancellable = true)
    private static void createDefault_1393142249(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1393142249L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "modelCustomisation()I", cancellable = true)
    private void modelCustomisation__345499055(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-345499055L))
            info.setReturnValue(-1891428423);
    }

    @Inject(at = @At("HEAD"), method = "chatColors()Z", cancellable = true)
    private void chatColors_819499115(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(819499115L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "mainHand()Lnet/minecraft/world/entity/HumanoidArm;", cancellable = true)
    private void mainHand_1299179022(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1299179022L))
            info.setReturnValue(net.minecraft.world.entity.HumanoidArm.RIGHT);
    }


}

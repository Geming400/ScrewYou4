package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.level.ClientInformation.class)
public class ClientInformation_41960605Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1427472863(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1427472863L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1093499371(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1093499371L))
            info.setReturnValue("VYpqxf偉w6}gHE]'c%+1<Hk䳰&Y.ѩv.i䙙EF>1rB_;c㫥8+a㮛[g({Rs0Y+C{:Q");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_80223346(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(80223346L))
            info.setReturnValue(2120532526);
    }

    @Inject(at = @At("HEAD"), method = "write(Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void write__311532517(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-311532517L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "language()Ljava/lang/String;", cancellable = true)
    private void language__1093499867(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1093499867L))
            info.setReturnValue("ZࡳbI㭄");
    }

    @Inject(at = @At("HEAD"), method = "viewDistance()I", cancellable = true)
    private void viewDistance_80222850(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(80222850L))
            info.setReturnValue(-1897415562);
    }

    @Inject(at = @At("HEAD"), method = "allowsListing()Z", cancellable = true)
    private void allowsListing_80239187(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(80239187L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "chatVisibility()Lnet/minecraft/world/entity/player/ChatVisiblity;", cancellable = true)
    private void chatVisibility_590508208(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(590508208L))
            info.setReturnValue(net.minecraft.world.entity.player.ChatVisiblity.SYSTEM);
    }

    @Inject(at = @At("HEAD"), method = "particleStatus()Lnet/minecraft/server/level/ParticleStatus;", cancellable = true)
    private void particleStatus__1630350203(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1630350203L))
            info.setReturnValue(net.minecraft.server.level.ParticleStatus.ALL);
    }

    @Inject(at = @At("HEAD"), method = "textFilteringEnabled()Z", cancellable = true)
    private void textFilteringEnabled_80239187(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(80239187L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "createDefault()Lnet/minecraft/server/level/ClientInformation;", cancellable = true)
    private static void createDefault__889928828(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-889928828L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "modelCustomisation()I", cancellable = true)
    private void modelCustomisation_80222850(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(80222850L))
            info.setReturnValue(-1897415562);
    }

    @Inject(at = @At("HEAD"), method = "mainHand()Lnet/minecraft/world/entity/HumanoidArm;", cancellable = true)
    private void mainHand_1750711366(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1750711366L))
            info.setReturnValue(net.minecraft.world.entity.HumanoidArm.RIGHT);
    }

    @Inject(at = @At("HEAD"), method = "chatColors()Z", cancellable = true)
    private void chatColors_80239187(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(80239187L))
            info.setReturnValue(true);
    }


}

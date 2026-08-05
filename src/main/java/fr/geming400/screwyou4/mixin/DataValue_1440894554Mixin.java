package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.syncher.SynchedEntityData.DataValue.class)
public class DataValue_1440894554Mixin {
        @Inject(at = @At("HEAD"), method = "value()Ljava/lang/Object;", cancellable = true)
    private void value__994880524(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-994880524L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1468560484(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1468560484L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_305434578(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(305434578L))
            info.setReturnValue("현:Th;k;fgv&㗧V 9&n;u'U/4>O掹J㑃");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1479157295(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1479157295L))
            info.setReturnValue(1431893771);
    }

    @Inject(at = @At("HEAD"), method = "id()I", cancellable = true)
    private void id_1479156799(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1479156799L))
            info.setReturnValue(1635041190);
    }

    @Inject(at = @At("HEAD"), method = "write(Lnet/minecraft/network/RegistryFriendlyByteBuf;)V", cancellable = true)
    private void write__842012491(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-842012491L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)Lnet/minecraft/network/syncher/SynchedEntityData$DataValue;", cancellable = true)
    private static void create__1840606416(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1840606416L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "read(Lnet/minecraft/network/RegistryFriendlyByteBuf;I)Lnet/minecraft/network/syncher/SynchedEntityData$DataValue;", cancellable = true)
    private static void read_414177779(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(414177779L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "serializer()Lnet/minecraft/network/syncher/EntityDataSerializer;", cancellable = true)
    private void serializer__5523714(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-5523714L))
            info.setReturnValue(null);
    }


}

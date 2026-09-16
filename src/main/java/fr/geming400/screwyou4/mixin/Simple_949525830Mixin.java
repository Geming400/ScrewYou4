package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.WorldVersion.Simple.class)
public class Simple_949525830Mixin {
        @Inject(at = @At("HEAD"), method = "name()Ljava/lang/String;", cancellable = true)
    private void name_1758792985(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1758792985L))
            info.setReturnValue("O$MNJE\u5C33]&bC^B\uB63A{$qQDtlwwU(i!\u0D0Ae");
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_40899561(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(40899561L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1719949354(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1719949354L))
            info.setReturnValue("Le\u08B98H=S1 4qcp&bJR}:\u13BFj=*v|wy9");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1506877920(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1506877920L))
            info.setReturnValue(1315726286);
    }

    @Inject(at = @At("HEAD"), method = "id()Ljava/lang/String;", cancellable = true)
    private void id_1290687401(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1290687401L))
            info.setReturnValue("'$**k{5\u6294x'?DRG39pOE}\uADD8*^");
    }

    @Inject(at = @At("HEAD"), method = "protocolVersion()I", cancellable = true)
    private void protocolVersion_177232907(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(177232907L))
            info.setReturnValue(517006295);
    }

    @Inject(at = @At("HEAD"), method = "dataVersion()Lnet/minecraft/world/level/storage/DataVersion;", cancellable = true)
    private void dataVersion_1028534493(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1028534493L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stable()Z", cancellable = true)
    private void stable__1098910559(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1098910559L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "packVersion(Lnet/minecraft/server/packs/PackType;)Lnet/minecraft/server/packs/metadata/pack/PackFormat;", cancellable = true)
    private void packVersion_693822636(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(693822636L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resourcePackVersion()Lnet/minecraft/server/packs/metadata/pack/PackFormat;", cancellable = true)
    private void resourcePackVersion__898829627(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-898829627L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "datapackVersion()Lnet/minecraft/server/packs/metadata/pack/PackFormat;", cancellable = true)
    private void datapackVersion__1677878207(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1677878207L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "buildTime()Ljava/util/Date;", cancellable = true)
    private void buildTime_264641856(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(264641856L))
            info.setReturnValue(null);
    }


}

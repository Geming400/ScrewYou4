package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.WorldVersion.Simple.class)
public class Simple_949525830Mixin {
        @Inject(at = @At("HEAD"), method = "name()Ljava/lang/String;", cancellable = true)
    private void name__185934642(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-185934642L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1959929208(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1959929208L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__185934146(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-185934146L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_987788571(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(987788571L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "id()Ljava/lang/String;", cancellable = true)
    private void id__185934642(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-185934642L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "protocolVersion()I", cancellable = true)
    private void protocolVersion_987788075(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(987788075L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dataVersion()Lnet/minecraft/world/level/storage/DataVersion;", cancellable = true)
    private void dataVersion__1261352597(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1261352597L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stable()Z", cancellable = true)
    private void stable_987804412(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(987804412L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resourcePackVersion()Lnet/minecraft/server/packs/metadata/pack/PackFormat;", cancellable = true)
    private void resourcePackVersion__1833411274(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1833411274L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "datapackVersion()Lnet/minecraft/server/packs/metadata/pack/PackFormat;", cancellable = true)
    private void datapackVersion__1833411274(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1833411274L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "packVersion(Lnet/minecraft/server/packs/PackType;)Lnet/minecraft/server/packs/metadata/pack/PackFormat;", cancellable = true)
    private void packVersion_46108781(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(46108781L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "buildTime()Ljava/util/Date;", cancellable = true)
    private void buildTime__457756059(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-457756059L))
            info.setReturnValue(null);
    }


}

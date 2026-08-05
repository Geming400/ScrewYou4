package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.DataVersion.class)
public class DataVersion71546960Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1457059219(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1457059219L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1063913015(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1063913015L))
            info.setReturnValue("m6{SIAY}7Z:J㊝0D-ZFMZFBI6*");
    }

    @Inject(at = @At("HEAD"), method = "version()I", cancellable = true)
    private void version_109809206(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(109809206L))
            info.setReturnValue(-2053292655);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_109809702(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(109809702L))
            info.setReturnValue(-680508580);
    }

    @Inject(at = @At("HEAD"), method = "isCompatible(Lnet/minecraft/world/level/storage/DataVersion;)Z", cancellable = true)
    private void isCompatible_341620992(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(341620992L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isSideSeries()Z", cancellable = true)
    private void isSideSeries_109825543(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(109825543L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "series()Ljava/lang/String;", cancellable = true)
    private void series__1063913511(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1063913511L))
            info.setReturnValue("V퍎jCY*4D^UrRQrw/oi\"\"x試l:g-N>tq|㉽Vk[柺`!ໄ1X` V@|A姌淣B2\"䧙眓@$譲iU⚁!놡*q皘x^peM䒢軓s갪uz=F,5맑%");
    }


}

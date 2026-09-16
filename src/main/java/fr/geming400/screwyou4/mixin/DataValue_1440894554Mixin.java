package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.syncher.SynchedEntityData.DataValue.class)
public class DataValue_1440894554Mixin {
        @Inject(at = @At("HEAD"), method = "value()Ljava/lang/Object;", cancellable = true)
    private void value_437373605(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(437373605L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_532268285(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(532268285L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__2083649218(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2083649218L))
            info.setReturnValue("KTiF*L3RV1N\uBAE4\u8B19!W):k%u\u7786t5:\u46A7&T!\uC1D1(XVO:(<#u'R7J=b#iV\u24A4TS'Zvn\u11C4\u3ED1J]!\u9800\"q{vo6P");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1998246644(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1998246644L))
            info.setReturnValue(2123116705);
    }

    @Inject(at = @At("HEAD"), method = "id()I", cancellable = true)
    private void id__1254289404(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1254289404L))
            info.setReturnValue(1906784020);
    }

    @Inject(at = @At("HEAD"), method = "write(Lnet/minecraft/network/RegistryFriendlyByteBuf;)V", cancellable = true)
    private void write_1342529300(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1342529300L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)Lnet/minecraft/network/syncher/SynchedEntityData$DataValue;", cancellable = true)
    private static void create_1754742964(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1754742964L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "read(Lnet/minecraft/network/RegistryFriendlyByteBuf;I)Lnet/minecraft/network/syncher/SynchedEntityData$DataValue;", cancellable = true)
    private static void read_965339549(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(965339549L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "serializer()Lnet/minecraft/network/syncher/EntityDataSerializer;", cancellable = true)
    private void serializer_630279824(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(630279824L))
            info.setReturnValue(null);
    }


}

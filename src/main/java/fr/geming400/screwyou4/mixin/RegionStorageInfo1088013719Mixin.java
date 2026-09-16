package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.chunk.storage.RegionStorageInfo.class)
public class RegionStorageInfo1088013719Mixin {
        @Inject(at = @At("HEAD"), method = "type()Ljava/lang/String;", cancellable = true)
    private void type__726004518(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-726004518L))
            info.setReturnValue("8s_\u9B92=|\u5A81wDL9U3h8JEV\u3F52 \uFE03G'TpA");
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_179387451(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(179387451L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1858437244(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1858437244L))
            info.setReturnValue(")OxM%\u31A0\uB3B9SbTJuD\u9455\u3C4Em\u429C}:i\u1E764*wW#B 5sht/dZ\u7E1ER.@'3Wp-\u6F31&EG_6\uFB7Eh9*K=Ai\uC9FE");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1645365810(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1645365810L))
            info.setReturnValue(-1398061172);
    }

    @Inject(at = @At("HEAD"), method = "level()Ljava/lang/String;", cancellable = true)
    private void level__1914018396(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1914018396L))
            info.setReturnValue("j=v\uAFBAH7>[c|8&I\uB3DCB\u2496(Mp\u1B58r\u0D34u}iiYlz\u22EF\uA9D3\u8C20i\uA41FI_e}\u32B07</c\uB6F7M_\u4A4Ae;iv^Q\uB13Fv+JhX\u8343gK\u8312");
    }

    @Inject(at = @At("HEAD"), method = "dimension()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void dimension_1252047906(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1252047906L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withTypeSuffix(Ljava/lang/String;)Lnet/minecraft/world/level/chunk/storage/RegionStorageInfo;", cancellable = true)
    private void withTypeSuffix__1128622607(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1128622607L))
            info.setReturnValue(null);
    }


}

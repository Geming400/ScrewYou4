package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.filefix.access.FileResourceTypes.class)
public class FileResourceTypes_2032178847Mixin {
        @Inject(at = @At("HEAD"), method = "chunk(Lnet/minecraft/util/datafix/DataFixTypes;Lnet/minecraft/world/level/chunk/storage/RegionStorageInfo;)Lnet/minecraft/util/filefix/access/FileResourceType;", cancellable = true)
    private static void chunk_178159529(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(178159529L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "savedData(Lcom/mojang/datafixers/DSL$TypeReference;Lnet/minecraft/util/filefix/access/CompressedNbt$MissingSeverity;)Lnet/minecraft/util/filefix/access/FileResourceType;", cancellable = true)
    private static void savedData__1136649486(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1136649486L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "savedData(Lcom/mojang/datafixers/DSL$TypeReference;)Lnet/minecraft/util/filefix/access/FileResourceType;", cancellable = true)
    private static void savedData_1087427105(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1087427105L))
            info.setReturnValue(null);
    }


}

package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.JigsawBlockEntity.JointType.class)
public class JointType1048987193Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/entity/JigsawBlockEntity$JointType;", cancellable = true)
    private static void values__1858251881(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1858251881L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/entity/JigsawBlockEntity$JointType;", cancellable = true)
    private static void valueOf__1059306604(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1059306604L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName__86473278(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-86473278L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTranslatedName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getTranslatedName__1127921972(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1127921972L))
            info.setReturnValue(null);
    }


}

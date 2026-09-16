package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.ResourceOrIdArgument.ReferenceResult.class)
public class ReferenceResult_658669585Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__249956684(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-249956684L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1429093109(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1429093109L))
            info.setReturnValue("T8e+{8O{Q|\uABD83_&}Yl1e>6Y4_@ZR\u4AD51\uB7E3YPMLrv`\uC3ED\uC24DDD\uC37A&4V9H\uAE18IK'\u117DCX+\u14ABD,E\u9BA00/yXOdJs#i`");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1216021675(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1216021675L))
            info.setReturnValue(635483273);
    }

    @Inject(at = @At("HEAD"), method = "key()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void key__1041632830(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1041632830L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/ImmutableStringReader;Lnet/minecraft/core/HolderLookup$Provider;Lcom/mojang/serialization/DynamicOps;Lcom/mojang/serialization/Codec;Lnet/minecraft/core/HolderLookup$RegistryLookup;)Lnet/minecraft/core/Holder;", cancellable = true)
    private void parse__1266353820(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1266353820L))
            info.setReturnValue(null);
    }


}
